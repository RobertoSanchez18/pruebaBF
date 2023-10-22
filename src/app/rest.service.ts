import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuarios } from './usuarios';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  private apiUsers = 'http://localhost:8085/classkeeper/v1/users';

  constructor(private http: HttpClient) { }

  traerDatos(): Observable<Usuarios[]> {
    return this.http.get<Usuarios[]>(this.apiUsers);
  }

}
