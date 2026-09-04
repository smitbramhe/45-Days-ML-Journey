# import numpy as np
# data_grid = np.arange(1,26).reshape(5,5)
# print(data_grid)
# print("=" * 30) 

# # Hamein is grid ka bilkul BECH (center) ka 3x3 block chahiye.

# print(data_grid[1:4 , 1:4])

# ================================================CONFIDENCE BOSTER================================================================
import numpy as np

zero_grid = np.zeros((6, 6))
print(zero_grid)
print("=" * 50)
zero_grid[1:5 , 1:5] = 1
print(zero_grid)