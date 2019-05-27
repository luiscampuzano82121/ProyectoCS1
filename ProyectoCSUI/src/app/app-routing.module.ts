import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SignInComponent} from './sign-in/sign-in.component';
import {AdministradorComponent} from './administrador/administrador.component';
import {EntrenadorComponent} from './entrenador/entrenador.component';
import {ConsultarmatriculadosComponent} from './common/consultarmatriculados/consultarmatriculados.component';
import {EntrenadoresComponent} from './administrador/entrenadores/entrenadores.component';
import {DestacadosComponent} from './administrador/destacados/destacados.component';
import {DeportesAdministradorComponent} from './administrador/deportes-administrador/deportes-administrador.component';
import {DeportesEntrenadorComponent} from './entrenador/deportes-entrenador/deportes-entrenador.component';
import {MejoresEntrenadoresComponent} from './administrador/mejores-entrenadores/mejores-entrenadores.component';
import {MejoresEstudiantesComponent} from './administrador/mejores-estudiantes/mejores-estudiantes.component';

const routes: Routes = [
  { path: '', component: SignInComponent, pathMatch: 'full'},
  { path: 'sign-in', component: SignInComponent},
  { path: 'administrador', component: AdministradorComponent,
    children: [
      { path: '', component: ConsultarmatriculadosComponent, pathMatch: 'full'},
      { path: 'consultarmatriculados', component: ConsultarmatriculadosComponent},
      { path: 'entrenadores', component: EntrenadoresComponent},
      { path: 'destacados', component: DestacadosComponent},
      { path: 'deportes-administrador', component: DeportesAdministradorComponent},
      { path: 'mejores-entrenadores', component: MejoresEntrenadoresComponent},
      { path: 'mejores-estudiantes', component: MejoresEstudiantesComponent}
    ]
  },
  { path: 'entrenador', component: EntrenadorComponent,
    children: [
      { path: '', component: ConsultarmatriculadosComponent, pathMatch: 'full'},
      { path: 'consultarmatriculados', component: ConsultarmatriculadosComponent},
      { path: 'deportes-entrenador', component: DeportesEntrenadorComponent}
      ]},
   { path: '**', redirectTo: 'sign-in', pathMatch: 'full'},
      ];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
