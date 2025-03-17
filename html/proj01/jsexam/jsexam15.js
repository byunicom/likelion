// const kang = {
//   name: "kang",
//   phone: "011-1111-1111",
//   say: function () {
//     console.log("말을 하다.");
//   },
// };

function Animal(type, name, sound) {
  this.type = type;
  this.name = name;
  this.sound = sound;
  this.say = function () {
    console.log(this.sound);
  };
}

const dog = new Animal("개", "멍멍이", "멍멍");

dog.say();
