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
import { DeportesComponent } from './common/deportes/deportes.component';
import { EntrenadoresComponent } from './administrador/entrenadores/entrenadores.component';
import { DestacadosComponent } from './administrador/destacados/destacados.component';
import { NavBarEntrenadorComponent } from './entrenador/nav-bar-entrenador/nav-bar-entrenador.component';
import { NavBarAdministradorComponent } from './administrador/nav-bar-administrador/nav-bar-administrador.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    EntrenadorComponent,
    AdministradorComponent,
    ConsultarmatriculadosComponent,
    DeportesComponent,
    EntrenadoresComponent,
    DestacadosComponent,
    NavBarEntrenadorComponent,
    NavBarAdministradorComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [DataService, CookieService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
