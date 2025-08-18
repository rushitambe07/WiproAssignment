import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { ListcompComponent } from './app/listcomp/listcomp.component';
import { ConditionalExpr } from '@angular/compiler';
import { ConditionalcompComponent } from './app/conditionalcomp/conditionalcomp.component';
import { CitycompComponent } from './app/citycomp/citycomp.component';
import { SwitchdemoComponent } from './app/switchdemo/switchdemo.component';
import { SearchfilterComponent } from './app/searchfilter/searchfilter.component';
import { Ex15HomeComponent } from './app/ex-15-home/ex-15-home.component';

bootstrapApplication( Ex15HomeComponent, appConfig)
  .catch((err) => console.error(err));
