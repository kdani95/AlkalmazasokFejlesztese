import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { IssueListComponent } from '../issue-list/issue-list.component';
import { MainPageComponent } from '../main-page/main-page.component';
import { OrderComponent } from '../order/order.component';

const routes: Routes = [
{
  path: '',
  component: MainPageComponent
},
{
    path: 'items',
    component: IssueListComponent
},
{
  path: 'order',
  component: OrderComponent
}
]

@NgModule({
  declarations: [],
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class RoutingModule { }
