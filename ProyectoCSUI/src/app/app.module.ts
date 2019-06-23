import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {DataService} from './data.service';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import {CookieService} from 'ngx-cookie-service';
import { SignInComponent } from './sign-in/sign-in.component';
import {FormsModule} from '@angular/forms';
import { EntrenadorComponent } from './entrenador/entrenador.component';
import { AdministradorComponent } from './administrador/administrador.component';
import { ConsultarmatriculadosComponent } from './common/consultarmatriculados/consultarmatriculados.component';
import { EntrenadoresComponent } from './administrador/entrenadores/entrenadores.component';
import { DestacadosComponent } from './administrador/destacados/destacados.component';
import { NavBarEntrenadorComponent } from './entrenador/nav-bar-entrenador/nav-bar-entrenador.component';
import { NavBarAdministradorComponent } from './administrador/nav-bar-administrador/nav-bar-administrador.component';
import { DeportesEntrenadorComponent } from './entrenador/deportes-entrenador/deportes-entrenador.component';
import { DeportesAdministradorComponent } from './administrador/deportes-administrador/deportes-administrador.component';
import { MejoresEstudiantesComponent } from './administrador/mejores-estudiantes/mejores-estudiantes.component';
import { MejoresEntrenadoresComponent } from './administrador/mejores-entrenadores/mejores-entrenadores.component';
import { LogoComponent } from './logo/logo.component';
import { FootergeneralComponent } from './common/footergeneral/footergeneral.component';
import { HorariosComponent } from './entrenador/deportes-entrenador/horarios/horarios.component';
import { ListadocategoriaComponent } from './entrenador/deportes-entrenador/listadocategoria/listadocategoria.component';
import {ExcelService} from './services/excel.service';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    EntrenadorComponent,
    AdministradorComponent,
    ConsultarmatriculadosComponent,
    EntrenadoresComponent,
    DestacadosComponent,
    NavBarEntrenadorComponent,
    NavBarAdministradorComponent,
    DeportesEntrenadorComponent,
    DeportesAdministradorComponent,
    MejoresEstudiantesComponent,
    MejoresEntrenadoresComponent,
    LogoComponent,
    FootergeneralComponent,
    HorariosComponent,
    ListadocategoriaComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [DataService, CookieService, ExcelService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
