# Write your MySQL query statement below
Select user_id,
count(1) as prompt_count,
Round(Avg(tokens),2) as avg_tokens 
from prompts 
group by user_id 
having prompt_count>2 and Max(tokens)>avg_tokens
 order by avg_tokens desc;