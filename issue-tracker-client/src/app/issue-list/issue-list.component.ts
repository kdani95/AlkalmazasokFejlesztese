import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { ItemService } from '../issue.service';
import { Order } from '../order';
import { OrderService } from '../order.service';

@Component({
  selector: 'issue-list',
  templateUrl: './issue-list.component.html',
  styleUrls: ['./issue-list.component.css']
})
export class IssueListComponent implements OnInit {
  private serviceUrl = 'http://localhost:8080/orders';

  constructor(private itemService: ItemService,private orderService: OrderService) { }

  items: Item[] = [];
  filteredItems: Item[] = [];

  selectedCategory = '';
  selectedItem: Item = null;
  filterItems()
  {
    this.filteredItems = 
      this.selectedCategory === '' 
      ? this.items 
      : this.items.filter(is => is.category.name === this.selectedCategory)
  }

  onFilterChange(value)
  {
    this.selectedCategory = value;
    this.filterItems();
  }

  async ngOnInit() 
  {
    this.items = await this.itemService.getItems();
    this.filterItems();
  }

  async onSelected(id : number){
    var order = new Order();
    order.orderId = 2;
    order.phoneNumber = "";
    order.address = "";
    var item = await this.itemService.getItem(id);
    order.item = item;
    this.orderService.addOrder(order);
    
  }

}




