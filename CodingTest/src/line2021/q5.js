class Stack {
  datas = [];
  top = 0;

  push(data) {
    this.datas[this.top++] = data;
  }

  pop() {
    if (this.top === 0) return undefined;
    return this.datas[--this.top];
  }

  values() {
    const values = [];
    for (let i = 0; i < this.top; i++) {
      values[i] = this.datas[i];
    }
    return values;
  }
}

var stack = new Stack();
console.log(stack.values(), [ ]);

stack.push('hello');
console.log(stack.values(), ['hello']);

stack.push('world');
stack.push('foo');
console.log(stack.values(), ['hello', 'world', 'foo']);

console.log(stack.pop(), 'foo');

stack.push('one');
console.log(stack.values(), ['hello', 'world', 'one']);

console.log(stack.pop(), 'one');
console.log(stack.pop(), 'world');
console.log(stack.pop(), 'hello');
console.log(stack.pop(), undefined);

stack.push('one');
console.log(stack.values(), ['one']);