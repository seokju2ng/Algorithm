const Queue = class {
  datas = [];

  enqueue = (data) => {
    this.datas.push(data);
  }

  dequeue = () => {
    return this.datas.shift();
  }
  length = () => {
    return this.datas.length;
  }
  toString = () => {
    return this.datas.toString();
  }
}

const Stack = class {
  queues;
  idx;

  constructor() {
    this.queues = [new Queue(), new Queue()];
    this.idx = 0;
  }

  push = (data) => {
    this.queues[this.idx].enqueue(data);
  }
  pop = () => {
    const len = this.queues[this.idx].length();
    for (let i = 0; i < len - 1; i++) {
      const data = this.queues[this.idx].dequeue();
      this.queues[this.idx ? 0 : 1].enqueue(data);
    }
    const result = this.queues[this.idx].dequeue();
    this.idx = this.idx ? 0 : 1;
    return result;
  }

  toString = () => {
    return this.queues[this.idx].toString();
  }
}

const s = new Stack();

s.push(1);
s.push(2);
s.push(3);
console.log(s.toString());

console.log(s.pop());

s.push(4);
s.push(5);

console.log(s.toString());

console.log(s.pop());
console.log(s.pop());
