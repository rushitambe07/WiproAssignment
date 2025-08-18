import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CitycompComponent } from './citycomp.component';

describe('CitycompComponent', () => {
  let component: CitycompComponent;
  let fixture: ComponentFixture<CitycompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CitycompComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CitycompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
