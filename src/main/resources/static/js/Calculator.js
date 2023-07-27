/*
 *  Add digit functions
 */

var isInvalidExpress = false;
function add9() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 9
    isInvalidExpress = false
}
function add8() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 8
    isInvalidExpress = false
}
function add7() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 7
    isInvalidExpress = false
}
function add6() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 6
    isInvalidExpress = false
}
function add5() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 5
    isInvalidExpress = false
}
function add4() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 4
    isInvalidExpress = false
}
function add3() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 3
    isInvalidExpress = false
}
function add2() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 2
    isInvalidExpress = false

}
function add1() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 1
    isInvalidExpress = false
}
function add0() {
    let resultAbove = document.getElementById('result-above')
    resultAbove.innerHTML += 0

}
function addDot() {
    let resultAbove = document.getElementById('result-above')
    console.log(isInvalidExpress)
    if(resultAbove.innerHTML.length != 0 && !resultAbove.innerHTML.includes('.') && !isInvalidExpress){
        resultAbove.innerHTML += '.'
        isInvalidExpress = true
    }
    console.log(resultAbove.innerHTML)

}

function add00() {
    let resultAbove = document.getElementById('result-above')
    if(resultAbove.innerHTML.length != 0 ){
        resultAbove.innerHTML += '00'
        isInvalidExpress = false
    }
}

/**
 * Clear function
 */

function clearResult() {
    let result = document.getElementById('result-above')
    result.innerHTML = ''
    isInvalidExpress = false

}

/**
 * Add operators
 */

function additionFunction(){
    let result = document.getElementById('result-above')
    if(result.innerHTML.length !=0 && !isInvalidExpress){
        result.innerHTML += '+'
        isInvalidExpress = true
    }
}

function subtractFunction(){
    let result = document.getElementById('result-above')
    if(result.innerHTML.length !=0 && !isInvalidExpress){
        result.innerHTML += '-'
        isInvalidExpress = true
    }
}

function multiplyFunction(){
    let result = document.getElementById('result-above')
    if(result.innerHTML.length !=0 && !isInvalidExpress){
        result.innerHTML += '*'
        isInvalidExpress = true
    }
}

function divideFunction(){
    let result = document.getElementById('result-above')
    if(result.innerHTML.length !=0 && !isInvalidExpress){
        result.innerHTML += '/'
        isInvalidExpress = true
    }

}

function deleteFunction(){

    let result = document.getElementById('result-above')
    if(result.innerHTML.length !=0){
        result.innerHTML = result.innerHTML.substring(0,result.innerHTML.length-1)
        isInvalidExpress = true
    }

}

