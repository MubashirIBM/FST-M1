import pandas
from pandas import ExcelWriter

data = {
    'FirstName' : ["Suresh", "Mukesh", "Nilesh"],
    'LastName' : ["Reddy", "Kumar","Sonu"],
    'Email' : ["suresh@gmail.com", "mukesh@gmail.com", "nilesh@gmail.com"],
    'PhoneNumber' : ["123456", "78647264", "543432432"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)
writer = ExcelWriter('Sample.xlsx')
dataframe.to_excel(writer,'Sheet1', index=False)
writer.close()