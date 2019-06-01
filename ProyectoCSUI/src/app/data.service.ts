import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {CookieService} from 'ngx-cookie-service';
import {New} from '../models/new';
import {Enviroment} from './environment';
import {catchError} from 'rxjs/internal/operators';
import {Observable} from 'rxjs';
import {Estudiante} from '../models/Estudiante';
import {Entrenador} from '../models/Entrenador';
import {Padre} from '../models/Padre';
import {Deporte} from '../models/Deporte';
import {Horario} from '../models/Horario';
import {DeporteEnviar} from '../models/DeporteEnviar';
import {EntrenadorEnviar} from '../models/EntrenadorEnviar';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  apiUrl = 'http://localhost:8080/news';
  apiUr = 'http://localhost:8080/api/auth/login';
  // url = 'http://localhost:8080/home/HolaMundo';
  private environment: Enviroment = new Enviroment();
  constructor(private http: HttpClient, private cookies: CookieService) {}
  // url = 'http://192.168.1.54'
  url = 'http://192.168.43.96';
  getHello() {
    return this.http.get(this.url + ':8081/home/Estudiantes')
      .subscribe(data => {   // data is already a JSON object
        console.log(data);
      });
  }

  getNews() {
    const authToken = 'Bearer ' + this.cookies.get('authToken');
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', authToken);
    return this.http.get<Estudiante[]>(this.url + ':8081/home/Estudiantes');
  }

   getEstudiantes() {
     const url = this.environment.getApiUrl() + this.environment.getUrlEstudiantes();
     return this.http.get<Estudiante[]>(this.url + ':8081/home/Estudiantes');
   }

  getEntrenadores() {
    return this.http.get<Entrenador[]>(this.url + ':8081/home/Entrenadores');
  }


  getPadres() {
    return this.http.get<Padre[]>(this.url + ':8081/home/Padres');
  }

  getDeportes() {
    return this.http.get<Deporte[]>(this.url + ':8081/home/Deportes');
  }

  createHorario(horario: Horario) {
    const create = this.http.post(this.url + ':8081/home/Estudiantes', horario);
    create.subscribe();
  }

  createDeporte(deporteEnviar: DeporteEnviar) {
    const create = this.http.post(this.url + ':8081/home/Deportes', deporteEnviar);
    create.subscribe();
  }

  createEstudiante(estudiante: Estudiante) {
    const create = this.http.post(this.url + ':8081/home/Estudiantes', estudiante);
    create.subscribe();
  }

  createEntrenador(entrenador: EntrenadorEnviar) {
    const create = this.http.post(this.url + ':8081/home/Entrenadores', entrenador);
    create.subscribe();
  }

  /*

    deleteBuilding(id: number) {
      const authToken = 'Bearer ' + this.cookies.get('authToken');
      let headers = new HttpHeaders();
      const url = this.environment.getApiUrl() + this.environment.deleteBuiding(id);
      headers = headers.set('Authorization', authToken);
      const deleteRequest = this.http.delete<void>(url, { headers: headers});
      deleteRequest.subscribe();
    }

    updateBuilding(building: Building) {
      const authToken = 'Bearer ' + this.cookies.get('authToken');
      let headers = new HttpHeaders();
      headers = headers.set('Authorization', authToken);
      const url = this.environment.getApiUrl() + this.environment.getUrlBuilding();
      const update = this.http.put(url, building, {headers: headers});
      update.subscribe();
    }
    */
}
