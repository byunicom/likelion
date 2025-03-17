function sleep(ms) {
  return new Promise((resolve) => setTimeout(resolve, ms));
}

// function process(func) {
//   console.log("안녕하세요.");
//   sleep(3000).then(() => {
//     console.log("반갑습니다.");

//     func();
//   });
// }

console.log("Process 호출 전!!");

async function process() {
  console.log("Process 가 종료되었습니다.");
  await sleep(3000);
  console.log("반갑습니다.");
}

// console.log("process 호출 후1");
process();
