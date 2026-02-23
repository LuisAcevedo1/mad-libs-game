import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface MadLibRequest {
  animal: string;
  lugar: string;
  adjetivo: string;
  verbo: string;
}

@Injectable({
  providedIn: 'root'
})
export class MadlibService {

  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  generate(data: MadLibRequest): Observable<string> {
    return this.http.post(`${this.apiUrl}/generate`, data, {
      responseType: 'text'
    });
  }
}