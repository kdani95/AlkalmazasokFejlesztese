import { Injectable } from '@angular/core';
import { Order } from './order';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Item } from './item';

const httpOptions =
{
  headers: new HttpHeaders(
    {
      'Content-Type': 'application/json'
    }
  )
}

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private serviceUrl = 'http://localhost:8080/orders';

  orders: Order[] =
  [
    
  ]

  constructor(private httpClient: HttpClient) { }

  getItems(): Promise<Order[]>
  {
    return this.httpClient.get<Order[]>
      (this.serviceUrl, httpOptions).toPromise();
    // return Promise.resolve(this.issues);
  }

  getItem(id): Promise<Order>
  {
    return this.httpClient.get<Order>
      (`${this.serviceUrl}/${id}`, httpOptions).toPromise();
   // return this.issues.find(issue => issue.id === id);
  }

  removeOrder(order: string): Promise<Order>
  {
    return this.httpClient.delete<Order>(order).toPromise();
  }

  addOrder(order : Order): Promise<Order>
  {
    return this.httpClient.post<Order>(
      `${this.serviceUrl}`, order, httpOptions
    ).toPromise();
  }

}
