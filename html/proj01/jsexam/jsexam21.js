function work() {
  console.log("work start!");
  const start = Date.now();
  for (let i = 0; i < 10000000000; i++) {}
  const end = Date.now();
  console.log(end - start + "ms");
}

console.log("Start");
work();
console.log("End");
