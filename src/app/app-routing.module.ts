import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LogAnalyzerComponent} from "./Log-analyzer-component/Log-analyzer.component";

const routes: Routes = [{
  path: '',
  component: LogAnalyzerComponent
},];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
