import { Injectable } from '@angular/core';
import { Http, Response, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { SERVER_API_URL } from '../app.constants';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/map';

import { Weather } from './weather';


@Injectable()
export class WeatherService{
    constructor(private _http: Http){}
    getWeather(searchValue : string): Observable<Weather>{
        const params: URLSearchParams = new URLSearchParams();
        return this._http.get(SERVER_API_URL + 'api/weather/'+searchValue, {
            params
        }).map((res: Response) => res.json());
        /*
        return this._http.get<Weather>(this._serviceUrl+searchValue)
            .do(data => console.log('All: ' + JSON.stringify(data)))
            .catch(this.handleError);*/
    }
    /*
    getWeatherForNextDays(searchValue : string, days : number): Observable<Weather[]>{     
        return this._http.get<Weather[]>(this._serviceUrl+"forecast/"+searchValue+"/"+days,
        ).do(data => console.log('All: ' + JSON.stringify(data)))
         .catch(this.handleError);
    } 
    private handleError(err: HttpErrorResponse){
        let errorMessage = '';
        if (err.error instanceof Error) {
            errorMessage = `An error occurred: ${err.error.message}`;
        } else {
            errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
        }
        console.error(errorMessage);
        return Observable.throw(errorMessage);
    }*/
}


