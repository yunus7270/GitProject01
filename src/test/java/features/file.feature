Feature: Application Login

Scenario Outline: Verification of Application

Given visiting homepage of "https://secure.education.mn.gov/cas/login?service=https%3a%2f%2fsecure.education.mn.gov%2ftestwes%2findex.faces" website
When entering credentials <username> and <password> to log in
Then read the "Test message" from console
And verify the message "true"
And close all pages


Examples:
|username					| password 			|
|Elif Burcu					| Elifim 			|