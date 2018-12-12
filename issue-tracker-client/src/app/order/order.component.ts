import { Component, OnInit, Input } from '@angular/core';
import { Order } from '../order';
import { OrderService } from '../order.service';

@Component({
  selector: 'order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  private serviceUrl = 'http://localhost:8080/orders';

  constructor(private orderService: OrderService) { }

  orders: Order[] = [];
  filteredOrders: Order[] = [];

  selectedID = 2;

  filterOrders()
  {
    this.filteredOrders = 
      this.selectedID === 0 
      ? this.orders 
      : this.orders.filter(is => is.orderId === this.selectedID)
  }

  onFilterChange(value)
  {
    this.selectedID = value;
    this.filterOrders();
  }

  async ngOnInit() 
  {
    this.orders = await this.orderService.getItems();
    this.filterOrders();
  }

  async onSelected(id : number){
    await this.orderService.removeOrder(this.serviceUrl + "/" + id);
    location.reload();
  }

}




