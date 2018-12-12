import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'status-filter',
  templateUrl: './status-filter.component.html',
  styleUrls: ['./status-filter.component.css']
})
export class StatusFilterComponent implements OnInit {

  categories: string[] =  ['Computer','Kitchen','Fun']

  @Input() selectedCategory = '';
  @Output() change = new EventEmitter<string>();
  constructor() { }

  ngOnInit() {
  }

  onFilterChange(value){
    this.selectedCategory = value;
    this.change.emit(value);
  }

}
