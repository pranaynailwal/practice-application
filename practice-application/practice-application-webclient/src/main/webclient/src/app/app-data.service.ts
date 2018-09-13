import { SampleData } from './sample-data';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppDataService {
  private sampleDataURL = 'fetchSampleData';
  constructor(
    private http: HttpClient ) { }
  getSampleData(): Observable<SampleData[]> {
    return this.http.get<SampleData[]>(this.sampleDataURL);
  }
}
