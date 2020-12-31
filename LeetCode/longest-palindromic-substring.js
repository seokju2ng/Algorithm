// https://leetcode.com/problems/longest-palindromic-substring/

const longestPalindrome = s => {
  let result = "";

  const isRange = (a, b) => a >= 0 && b < s.length;

  const isPalindrome = (a, b) => s[a] === s[b];

  const dfs = (left, right) => {
    if (!isRange(left, right) || !isPalindrome(left, right)) return;

    if (result.length <= right - left) {
      result = s.substring(left, right + 1);
    }
    dfs(left - 1, right + 1);
  }

  for (let i = 0; i < s.length; i++) {
    dfs(i, i);  dfs(i, i + 1);
  }
  return result;
};

// input
const strs = ["babad", "cbbd", "a", "ac"];

for (const s of strs) {
  console.log(longestPalindrome(s));
}

// 1차 풀이에서 시간초과났던 입력 예제
console.log(longestPalindrome("kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv"));
