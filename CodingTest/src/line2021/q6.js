function solution(num) {
  console.log(getData(num));
  return getData(num).then(result => getMax(Object.values(result)));
}

// DO NOT TOUCH BELOW CODE
function getData(num) {
  return Promise.resolve({
      first: 80 * num,
      second: 300 * num
  });
}

// DO NOT TOUCH BELOW CODE
function getMax(numbers) {
  console.log(...numbers);
  return Promise.resolve(Math.max(...numbers));
}

// DO NOT TOUCH BELOW CODE
// eval(function(p,a,c,k,e,d){e=function(c){return c};if(!''.replace(/^/,String)){while(c--){d[c]=k[c]||c}k=[function(e){return d[e]}];e=function(){return'\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c])}}return p}('3.1.4("6"),3.1.5("7",0=>{14 2=8.13(0);12(2).11(0=>{9.10(0)})});',10,15,'s|stdin|o|process|setEncoding|on|utf8|data|JSON|console|log|then|solution|parse|var'.split('|'),0,{}))

solution(1).then(result => console.log(result, 80));
solution(2).then(result => console.log(result, 160));
solution(10).then(result => console.log(result, 800));