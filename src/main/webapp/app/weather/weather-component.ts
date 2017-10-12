import { Component, OnInit } from '@angular/core';
import { WeatherService} from './weather.service';
import { Weather} from './weather';

@Component({
    selector: 'jhi-weather',
    templateUrl: './weather.component.html', 
    providers: [ WeatherService]
})

export class WeatherComponent implements OnInit{
    searchValue : string = "Oulu";
    weather : Weather;
   

    errorMessage : string;
    constructor(private _weatherService: WeatherService){
    }

    search():void{
        console.log('Search ' + this.searchValue);
        
        this._weatherService.getWeather(this.searchValue)
        .subscribe(weather => {
            this.weather = weather;
            console.log("Fetched weather for " +weather)
        }, error => this.errorMessage = <any>error);
    }
    /*
    nextTenDays():void{
        console.log('Search next 10 days for ' + this.searchValue);
        this._weatherService.getWeatherForNextDays(this.searchValue, 10)
        .subscribe(weather => {
            this.weather = weather;
        }, error => this.errorMessage = <any>error);
        
    }*/
    
    ngOnInit():void{
        this._weatherService.getWeather(this.searchValue)
                .subscribe(weather => {
                    this.weather = weather;
                   
                },
        error => this.errorMessage = <any>error);
    }
}