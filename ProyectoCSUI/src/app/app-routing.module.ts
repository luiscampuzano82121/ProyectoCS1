import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {NavBarComponent} from './nav-bar/nav-bar.component';
import {SignInComponent} from './sign-in/sign-in.component';

const routes: Routes = [{ path: 'nav', component: NavBarComponent}, { path: 'sign-in', component: SignInComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
