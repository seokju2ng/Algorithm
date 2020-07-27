const NOT_EXIST = -1;

// solution
const solution = function (keyboard, keyword) {
    let curIdx = {x: 0, y: 0};
    let output = "";
    for (let i in keyword) {
        let ch = keyword.charAt(i);
        let location = find(keyboard, ch);
        if (location === NOT_EXIST)
            continue; // skip if not exist ch in keyboard
        output += printCmd(curIdx, location);
        curIdx = location;
    }
    return output;
}

// printCmd : return commands from "from" to "to"
const printCmd = function(fromIdx, toIdx) {
    // print up & down command
    let output = repeatCmdForAbsValue(fromIdx.x, toIdx.x, "^", "_");
    // print left & right command
    output += repeatCmdForAbsValue(fromIdx.y, toIdx.y, "<", ">");
    // print choice command
    output += "@";
    return output;
}

// 좌표 값을 비교해 case1 혹은 case2를 차이만큼 반복해주는 함수
const repeatCmdForAbsValue = function (fromIdx, toIdx, case1, case2) {
    let cmd = fromIdx - toIdx > 0 ? case1 : case2;
    return cmd.repeat(Math.abs(fromIdx - toIdx));
}

// find: returns the position of the character to find
const find = function (keyboard, ch) {
    for (let  i in keyboard) {
        for (let j in keyboard[i]) {
            if (keyboard[i][j] === ch) {
                return {x: i, y: j};
            }
        }
    }
    // return NOT_EXIST(-1) if not exist ch in keyboard
    return NOT_EXIST;
}


// input data
const keyboard = [["1", "2", "3", "4", "5", "6", "7", "8", "9", "0"],
            ["Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"],
            ["A", "S", "D", "F", "G", "H", "J", "K", "L", ";"],
            ["Z", "X", "C", "V", "B", "N", "M", ",", ".", "?"]];
const keywords = ["BOOST", "HELLO,CAMPER5;", "FROM.1984", "ID=SEOKJU2NG"];
// output data
for (let i in keywords) {
    console.log("in  :", keywords[i]);
    console.log("out :", solution(keyboard, keywords[i]));
}
