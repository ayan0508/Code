// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

function reverseWords(s) {
    const stack = [];
    let tmp = '';

    for (let i = 0; i < s.length; i++) {
        if (s[i] === ' ') {
            if (tmp.length > 0) {
                stack.push(tmp);
                tmp = '';
            }
        } else {
            tmp += s[i];
        }
    }

    if (tmp.length > 0) {
        stack.push(tmp);
    }

    let ans = '';
    while (stack.length > 0) {
        if (stack.length === 1) {
            ans += stack.pop();
        } else {
            ans += stack.pop() + ' ';
        }
    }

    return ans;
}
const name = prompt("Enter the string");
const reversedString = reverseWords(name);
console.log(reversedString); 
