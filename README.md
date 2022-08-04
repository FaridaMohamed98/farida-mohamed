# farida-mohamed



## Test Design

| ID  | Scenarios     | Test cases | Priority |
| --- | ------------- | ---------- | -------- |
| 1   | Validate if all lists, links, buttons/icons are clickable and routing correctly | <ul><li>Check add expence and add income buttons are clickable</li><li>Check side menu and all included items are clickable</li><li>Check the expenses/incomes list views are clickable</li><li>Check the filter menu and all included items are clickable</li><li>Check the "new transfer" icon is clickable</li></ul>  | High      |
| 2   | Validate if the user can Add expences when entering valid input| <ul><li>Check that user can add an expense when entering valid value and category</li><li>Check that user can add an expense after making an arithmatic operation to generate the value</li><li>Check that user can add an expense using a newly created category(in the same flow)</li></ul>  | High      |
| 3   | Validate if the user can not Add expences when adding empty/invalid input | <ul><li>Check the app won't save the expense if the value is empty</li><li>Check the app won't save the expense if the value is invalid(0,.,negative number)</li><li>Check the app won't save the expense if the category is not selected</li><li>Check the app won't save the expense if the user deleted the value after moving to screen of choosing the category</li></ul>     | Low       |
| 4   | Validate if the user can filter the saved input using all filters   | <ul><li>Check user can filter results using "Day"</li><li>Check user can filter results using "Week"</li><li>Check user can filter results using "Month"</li><li>Check user can filter results using "Year"</li><li>Check user can filter results using "All"</li><li>Check user can filter results using "Interval" by choosing the suggested interval</li><li>Check user can filter results using "Interval" by selecting a custom interval</li><li>Check user can filter results using "Choose date"</li></ul>  | Low      |
| 5   | Validate if the user can add a category for an expense/income  | <li>Check if the user can add an expense category from the side menu</li><li>Check if the user can add an income category from the side menu</li><li>Check if the user can add an expense category from the bottom icon (-)</li> <li>Check if the user can add an income category from the bottom icon(+)</li></ul>  | Medium      |
| 6  | Validate if the app calculate the balance correctly | <li>Check the balance is displayed in green if it's a positive balance</li><li>Check the balance is displayed in red if it's a negative balance</li><li>Check when adding the expenses more than the incomes, it's a negative balance</li><li>Check when adding incomes more than the expenses, it's a positive balance</li> <li>Check when adding expenses only, it's a negative balance</li><li>Check when adding incomes only, it's a positive balance</li></ul>  | High      |
| 7  | Validate if the percentages of the expences is divided among all expenses and the total equals 100%  | <li>Check when adding one expence, this expense is 100%</li><li>Check when adding more than one expence, the total percentage is divided on all based on the values and their sum is 100%</li><li>Check when deleting an expense, the percentages of each expense are recalculated and their total is 100%</li> <li>Check when the value of an expense is edited, the percentages are recalculated and total percentages is 100%</li></ul>  | Low       |
| 8   | Validate if the app requires a password when adding a password protection in order to view the data  | <li>Check if the user added a valid password, it passes</li><li>Check if user added incorrect password, it does not pass</li><li>Check if added incomplete/empty password, it does not pass</li> <li>Check when removing password protection, password is not required</li></ul>  | Medium      |
| 9  | Validate if the user can search for an expense/income | <ul><li>Check if search suggests words that matches typed keywords</li><li>Check if search displays no results when entering invalid/empty search input</li><li>Check if search results are cleared after removing the search input</li></ul> | Medium       |
| 10   | Validate if the app is functioning on different operating systems | <ul><li>Check app's behavior on IOS OS</li><li>Check app's behavior on Android OS </li></ul>  | Medium       |
| 11   | Validate if the app is compaitable with different screen orientations  | <ul><li>Check app's landscape view</li><li>Check app's portrait view</li><li>Check app's behavior when the network is off</li></ul>  | Low      |
| 12  | Validate the app’s behavior in different network levels   | <ul><li>Check app's behavior using a strong network</li><li>Check app's behavior using weak network</li><li>Check app's behavior when the network is disconnected</li></ul> | Medium       |


## Bug Reporting

### Bug #1

- Title: When adding a new exchange rate, a future date can be added

- Steps to Reproduce:
  - Open Monefy mobile application
  - Navigate to the side menu
  - Click on "Currencies"
  - Select one from the "others" currencies
  - Click on the add button 
  - Select a future date 
  - Click on the tick icon

- Expected Results:
App should reject future dates
- Actual Results:
App accepts future dates
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
Low
- Impact:
Low, impact on reliability
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182482118-64dc684c-88e2-4362-808d-0a04f2a9899a.jpg" height="600" width="300" >


### Bug #2

- Title: When adding a new exchange rate, the decimal places selected does not affect the number

- Steps to Reproduce:
  - Open Monefy mobile application
  - Navigate to the side menu
  - Click on "Currencies"
  - Select one from the "others" currencies
  - Select one of the decimal places
  - Click on the add button 
  - Enter a decimal number in "Exchange Rate" field
  - Click on the tick icon

- Expected Results:
App should approximate the number based on the selected decimal places
- Actual Results:
App does not approximate the value and display the actual result
- Affected Devices:
IOS
- Network:
4G
- Severity:
Medium
- Priority:
Medium
- Impact:
Low, impact on functionality 
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182485900-244bb028-f188-4a82-b022-76dc0c80fda6.jpg" height="600" width="300" >
<img src="https://user-images.githubusercontent.com/46287387/182485965-938db03d-0d78-4dd8-b51a-f4efad9dad2c.jpg" height="600" width="300" >


### Bug #3

- Title: When using any operational char (+,-,*,/) while adding an expence/income, the operational char selected is not highlighted

- Steps to Reproduce:
  - Open Monefy mobile application
  - Click on '+' or '-' icon 
  - Add a value then click on any operational char

- Expected Results:
App should highlight the selected operational char
- Actual Results:
App does not highlight the selected operational char
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
Low
- Impact:
Medium, impact on UX
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182489065-9d13ca57-b3e9-4e58-9c3a-3291e0c0e491.jpg" height="600" width="300" >



### Bug #4

- Title: No search bar is found for the currencies list

- Steps to Reproduce:
  - Open Monefy mobile application
  - Navigate to the side menu
  - Click on "Currencies"

- Expected Results:
App should display a search bar on the currencies list
- Actual Results:
App does not display a search bar on the currencies list
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
Low
- Impact:
Medium, impact on UX and ease of use 
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182490144-9a4e4e3d-f8eb-4ae9-b3cb-6740ffe210c1.jpg" height="600" width="300" >

### Bug #5

- Title: When adding a new account, the icons displayed are not descriptive and don’t show what does each icon represent.

- Steps to Reproduce:
  - Open Monefy mobile application
  - Navigate to the side menu
  - Click on "Accounts"
  - Click on the add icon

- Expected Results:
App should display all icons with a description of what each of them represent
- Actual Results:
App displays on the icon without any descriptions
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
High
- Impact:
Medium, impact on ease of use 
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182491388-4495cf8b-faae-42ff-93a9-f3744a8deb24.jpg" height="600" width="300" >

### Bug #6

- Title: When adding a category for an expense/income, it always displays "add category" without specifying if it's adding an expense or an income.

- Steps to Reproduce:
  - Open Monefy mobile application
  - Navigate to the side menu
  - Click on "Categories"
  - Click on the add icon 

- Expected Results:
App should display the category that is being created, either expense or income.
- Actual Results:
App displays "New Catgory" as a title without specifying which category.
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
Low
- Impact:
Low, impact on UX
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182492816-876f31f8-786f-4968-8bd6-e5e7540603f8.jpg" height="600" width="300" >

### Bug #7

- Title: App is not compitable with landscape view
- Steps to Reproduce:
  - Open Monefy mobile application
  - Change the device's orientation from portrait to landscape

- Expected Results:
App should be compitable with portrait and landscape views
- Actual Results:
App is not compitable with landscape view
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
Low
- Impact:
Medium, impact on compitability

### Bug #8

- Title: When filtering using "Date", a future dates can be added

- Steps to Reproduce:
  - Open Monefy mobile application
  - Navigate to the filter list
  - Select "Choose Day"
  - Select a future date 
  - Click on "ok"

- Expected Results:
App should reject future dates
- Actual Results:
App accepts future dates
- Affected Devices:
IOS
- Network:
4G
- Severity:
Low
- Priority:
Low
- Impact:
Low, impact on reliability
- Attachments
<img src="https://user-images.githubusercontent.com/46287387/182503805-c65b22f3-38c6-4c24-9984-4e81fd834c35.jpg" height="600" width="300" >
<img src="https://user-images.githubusercontent.com/46287387/182503858-d97c5142-7051-4829-9397-e6e3dd473680.jpg" height="600" width="300" >


## Test Automation

### Test cases needed for the search functionality

- Verify the search field and search icon are displayed (UI)
- Verify search results displayed are relevant to search keyword by adding valid search input (multiple test with different inputs)
- Verify search works by pressing the Enter key from the keyboard
- Verify search works by clicking on the search button
- Verify an error message display by entering invalid search input
- Verify search does not accept blank input
- Verify search suggests words that matches typed keywords (auto suggestion)
- Verify search results are cleared on clicking clear search button
- Verify total number of search records/results are displayed on page

