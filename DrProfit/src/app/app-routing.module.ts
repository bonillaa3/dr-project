import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ExpenseReportComponent } from './components/expense-report/expense-report.component'; 
import { DetailedExpenseComponent } from './components/detailed-expense/detailed-expense.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {
    path: 'detail-view',
    component: DetailedExpenseComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: '',
    component: ExpenseReportComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
}
