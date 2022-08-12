function numcompare(first, second){
    var dict = {
        'M':1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5, 'I':1}
        var one = first.split('').map(x => dict[x]).reduce((a,b) => a+b);
        var two = second.split('').map(x => dict[x]).reduce((a,b) => a+b);
        return one < two;
    }
}