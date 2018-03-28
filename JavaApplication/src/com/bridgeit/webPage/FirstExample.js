
function calculate()
{
	var firstNumber=parseInt(document.getElementById('number1').value);
		var secondNumber=parseInt(document.getElementById('number2').value);
		
	var oper=document.getElementById('operators').value;
	if(oper==='+')
		{
		document.getElementById('result').value=firstNumber+secondNumber;
		}
	else if(oper==='-')
		{
		document.getElementById('result').value=firstNumber-secondNumber;
		}
	else if(oper==='*')
		{
		document.getElementById('result').value=firstNumber*secondNumber;
		}
	else if(oper==='/')
		{
		document.getElementById('result').value=firstNumber/secondNumber;
		}

}
