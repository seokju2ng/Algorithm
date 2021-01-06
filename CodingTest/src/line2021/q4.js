const solution = (text) => {
	let result = 0;
	let count = 0;
	let flag = false;
	for (let i = 0; i < text.length; i++) {
		if (flag) count++;
		if (text[i] === '1') {
			flag = true;
			result = Math.max(result, count);
			count = 0;
		} 
	}
	console.log(result);
	return result;
}


console.log(solution('11')=== 1);
console.log(solution('101')=== 2);
console.log(solution('1001')=== 3);
console.log(solution('100001')=== 5);
console.log(solution('10010000101')=== 5);
console.log(solution('1000010010010000010001')=== 6);
console.log(solution('00000100101')=== 3);
console.log(solution('1000000'));
