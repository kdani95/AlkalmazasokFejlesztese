import { Item } from './item';

export class Order {
    id = null;
    orderId = null;
    address = '';
    phoneNumber = '';
    complete = '';
    item : Item = null;
}

//{"id":1,"orderId":1,"address":"BĂĽtykĂ¶s utca 99.","phoneNumber":"06111111111","complete":false,"item":{"id":1,"name":"YBoy","manufacturer":"Macrohard","typeNumber":12345,"description":"Ez egy nagyon jĂł jĂˇtĂ©kkonzol!","nettPrice":999999,"stock":1,"active":true,"category":{"id":1,"name":"Fun"}}}