# Q:- find the number of occurences in given number

let num = 12345

- now the `%` of num will give us last digit, so from this
- if(remender == givenNum){
  count++
  }
- and to remove the last digit we'll do `num = num/10` // 123/10= 12.3 == 12

so this was the approach for this question...

<br>
<br>
<hr>
<br>
<br>

# Q:- reverse the number

approach will be same as above, we just need to store the remender some where
to do that we will multiply it by 10 and add remender in it...

```js
let num = 12345; // reverse this number
let ans = 0;
let rem = ans % 10;
ans = ans * 10 + rem; // 0 * 10 + 5
```

<br>
<br>
<hr>
<br>
<br>

## Also Created calculator
