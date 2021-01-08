function solution(message, K) {
  if (message.length <= K) {
      return message;
  }
  let lastSpacePos = 0;
  
  for (let i = K; i >= 0; i--) {
      if (message[i] === ' ') {
          lastSpacePos = i;
          break;
      }
  }
  return message.substring(0, lastSpacePos);
}
