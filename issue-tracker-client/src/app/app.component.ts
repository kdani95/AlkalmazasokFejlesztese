import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  private _greetings: string[];
  private greeting: string;
  private _index: number;

  constructor() {
      this._greetings = [
          'Jó reggelt!',
          'Good morning!',
          'Guten tag!',
          'Buenos dias!'
      ];
      this._index = 0

      this._tick()

  }

  private _tick(): void {
      this.greeting = this._greetings[this._index];

      if (this._index + 1 < this._greetings.length) {
          ++this._index;
      }
      else {
          this._index = 0
      }

      setTimeout(this._tick.bind(this), 1000)
  }

  title = 'Webshop client';
}
