import { Injectable } from '@angular/core';
import { Item } from './item';
import { HttpClient, HttpHeaders } from '@angular/common/http';

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
export class ItemService {

  private serviceUrl = 'http://localhost:8080/items';

  issues: Item[] =
  [
    
  ]

  constructor(private httpClient: HttpClient) { }

  getItems(): Promise<Item[]>
  {
    return this.httpClient.get<Item[]>
      (this.serviceUrl, httpOptions).toPromise();
    // return Promise.resolve(this.issues);
  }

  getItem(id): Promise<Item>
  {
    return this.httpClient.get<Item>
      (`${this.serviceUrl}/${id}`, httpOptions).toPromise();
   // return this.issues.find(issue => issue.id === id);
  }

  
}
