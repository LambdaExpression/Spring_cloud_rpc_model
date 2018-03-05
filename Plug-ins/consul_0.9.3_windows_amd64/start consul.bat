@echo off
set CMDER_ROOT=D:\Program Files\cmder
set DL=%~d0
set LAST_CD=%cd%
if exist "%CMDER_ROOT%\vendor\init_consul.bat" (
	"%CMDER_ROOT%\vendor\init_consul.bat"
) else (
	consul agent -dev
)
