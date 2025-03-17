function test() {
  console.log("test");
  return 10;
}

let a = test();

let b = test;

console.log(a);
console.log(b);

b();
console.log("sumn함수 호출 전!");

sum(b);
console.log("sumn함수 호출 후!");

function sum(i) {
  i();
}
