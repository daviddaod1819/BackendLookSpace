export interface ISpace {
  id?: number;
  rooms?: number;
  meters?: number;
  price?: number;
  details?: string;
}

export class Space implements ISpace {
  constructor(public id?: number, public rooms?: number, public meters?: number, public price?: number, public details?: string) {}
}
