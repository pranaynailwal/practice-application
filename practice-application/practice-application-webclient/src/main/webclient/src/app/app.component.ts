import { Component } from '@angular/core';
import { AppDataService } from './app-data.service';
import { SampleData } from './sample-data';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'practice-application-web';
  data: SampleData[];
  constructor(
    private appDataService: AppDataService) { }
  apiCall(): void {
    this.appDataService.getSampleData().subscribe(data => this.data = data);
    console.log('printmsg');
  }
}
