function solution (a, b, c) {
  return new Promise(async (resolve) => {
    const resA = funcA(a);
    const resB = await funcB(b);
    const resC = await funcC(c);

    resolve(resA + resB + resC);
  })
}

function funcA (num) {
  return num;
}
function funcB (num) {
  return new Promise(function(resolve){
    resolve(num);
  });
}
async function funcC (num) {
  return num;
}

solution(10, 20, 30).then(result=>console.log(result));