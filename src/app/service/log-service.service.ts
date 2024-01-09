import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {LogResponse} from "../model/model";

@Injectable({
  providedIn: 'root'
})
export class LogServiceService {

  private apiUrl='http://localhost:8080/logsCheck';
  constructor(private http:HttpClient) { }

  getLogs(){

    return this.http.get<LogResponse>(this.apiUrl)
  }
}
