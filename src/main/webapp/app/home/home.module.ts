import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { WeatherSharedModule } from '../shared';
import { WeatherComponent} from '../weather/weather-component'

import { HOME_ROUTE, HomeComponent } from './';

@NgModule({
    imports: [
        WeatherSharedModule,
        RouterModule.forRoot([ HOME_ROUTE ], { useHash: true })
    ],
    declarations: [
        HomeComponent,
        WeatherComponent
    ],
    entryComponents: [
    ],
    providers: [
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class WeatherHomeModule {}
