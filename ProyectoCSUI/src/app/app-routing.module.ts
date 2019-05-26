import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SignInComponent} from './sign-in/sign-in.component';
import {AdministradorComponent} from './administrador/administrador.component';
import {EntrenadorComponent} from './entrenador/entrenador.component';
import {ConsultarmatriculadosComponent} from './common/consultarmatriculados/consultarmatriculados.component';
import {DeportesComponent} from './common/deportes/deportes.component';
import {EntrenadoresComponent} from './administrador/entrenadores/entrenadores.component';
import {DestacadosComponent} from './administrador/destacados/destacados.component';

const routes: Routes = [
  { path: '', component: SignInComponent, pathMatch: 'full'},
  { path: 'sign-in', component: SignInComponent},
  { path: 'administrador', component: AdministradorComponent,
    children: [
      { path: '', component: ConsultarmatriculadosComponent, pathMatch: 'full'},
      { path: 'consultarmatriculados', component: ConsultarmatriculadosComponent},
      { path: 'entrenadores', component: EntrenadoresComponent},
      { path: 'destacados', component: DestacadosComponent},
      { path: 'deportes', component: DeportesComponent}
    ]
  },
  { path: 'entrenador', component: EntrenadorComponent,
    children: [
      { path: '', component: ConsultarmatriculadosComponent, pathMatch: 'full'},
      { path: 'consult0armatriculados', component: ConsultarmatriculadosComponent},
      { path: 'deportes', component: DeportesComponent}
      ]},
   { path: '**', redirectTo: 'sign-in', pathMatch: 'full'},
      ];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
