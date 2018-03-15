Set Sapi = Wscript.CreateObject("SAPI.SpVoice")
set Sapi.Voice = Sapi.GetVoices.Item(0)
Sapi.Rate = 0.5
dim str
if hour(time) < 10 then
str = "Good Morning"
ElseIf hour(time) < 16 then
str = "Good Afternoon"
ElseIf hour(time) > 16 then
str = "Good Evening"
end if
Sapi.Volume = 100
str = str & "A R Hope you doing well Welcome to your Own World"
Sapi.speak str
