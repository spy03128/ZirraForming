import pandas as pd

df = pd.read_csv("data/oecd.csv", low_memory=False)
# print(df)
condition1 = df["Country"].isin(["United States", "Japan", "Germany", "United Kingdom", "France", "Italy", "Canada", "Korea", "Australia", "Spain"])
condition2 = df["Year"] >= 1990
condition3 = df["Year"] < 2020
df = df.loc[condition1 & condition2 & condition3 , ["Country", "POL", "Year", "Value"]]
df.to_csv("result/oecd-preprocessing-result.csv")