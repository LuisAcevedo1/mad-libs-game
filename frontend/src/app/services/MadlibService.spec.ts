import { TestBed } from '@angular/core/testing';

import { MadlibService} from './MadlibService';

describe('Madlib', () => {
  let service: MadlibService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MadlibService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
