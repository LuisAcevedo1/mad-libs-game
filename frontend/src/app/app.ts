import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MadlibService, MadLibRequest } from './services/MadlibService';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule],  
  templateUrl: './app.html'
})
export class App {

  story: string = '';

  constructor(private madlibService: MadlibService) {}

  generate(formData: MadLibRequest) {
    this.madlibService.generate(formData)
      .subscribe(response => {
        this.story = response;
      });
  }
}