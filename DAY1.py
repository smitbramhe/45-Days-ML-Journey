import numpy as np

zero_grid = np.zeros((6, 6))
print("6x6 Zero grid: \n",zero_grid)
print("=" * 50)
zero_grid[1:5 , 1:5] = 1
print("Digital Mask: \n",zero_grid)